# 3.2.4_rusty_reversing_medium

We are again provided with a binary with `debug_info` (debug symbols) set.

```
$ file rust_medium
rust_medium: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=64d74b20dd52b19944357f7c1d43dc5dbd3d21a3, with debug_info, not stripped
```

Attempting the same method as last time (searching for `flag` in the defined strings) I was presented with this part within the `main` function.

![b2400ca45c014bcfaadc859b63c7fa28.png](./screenshots/b2400ca45c014bcfaadc859b63c7fa28.png)

## gdb
Not seeing any obvious flags/passwords here I attempted to use [peda](https://github.com/longld/peda) version of [`gdb`](https://www.gnu.org/software/gdb/) and break at the `core::str::converts::from_utf8` function.
_Do not that I am very new to gdb, and there are most likely better ways to solving this_.

We set a breakpoint (`b from_utf8`) at the `from_utf8` function, run the binary, and input some random password.

```
$ gdb -q rust_medium
Reading symbols from rust_medium...
gdb-peda$ b from_utf8
Breakpoint 1 at 0x4754b: file library/core/src/str/converts.rs, line 86.
gdb-peda$ r
Starting program: 3_utfordringer/2_middels/rust_middels/rust_medium
Enter password: PASSWORD
[----------------------------------registers-----------------------------------]
RAX: 0x7fff2eb21cc0 --> 0x3
RBX: 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
RCX: 0x7fff2eb21ca8 --> 0x0
RDX: 0x9 ('\t')
RSI: 0x555556056740 ("PASSWORD\np\037K@\177")
RDI: 0x0
RBP: 0x0
RSP: 0x7fff2eb21c68 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
RIP: 0x7f404b1df54b (<_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx)
R8 : 0x555556056730 --> 0x41 ('A')
R9 : 0x18a0
R10: 0x2a ('*')
R11: 0x246
R12: 0x7f404b1f62e0 --> 0x0
R13: 0x1
R14: 0x7fff2eb21de0 --> 0x5
R15: 0x0
EFLAGS: 0x246 (carry PARITY adjust ZERO sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f404b1df545 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+5>:	push   rbx
   0x7f404b1df546 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+6>:	mov    rax,rdi
   0x7f404b1df549 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+9>:	xor    edi,edi
=> 0x7f404b1df54b <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx
   0x7f404b1df54e <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+14>:	sub    rcx,0xf
   0x7f404b1df552 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+18>:	cmovae rdi,rcx
   0x7f404b1df556 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+22>:	test   rdx,rdx
   0x7f404b1df559 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+25>:	
    je     0x7f404b1df759 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+537>
[------------------------------------stack-------------------------------------]
0000| 0x7fff2eb21c68 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
0008| 0x7fff2eb21c70 --> 0x7fff2eb21de0 --> 0x5
0016| 0x7fff2eb21c78 --> 0x0
0024| 0x7fff2eb21c80 --> 0x0
0032| 0x7fff2eb21c88 --> 0x7f404b1ad86b (<_ZN62_$LT$std..io..stdio..StdinLock$u20$as$u20$std..io..BufRead$GT$9read_line17h83b5cac8a98f85baE+91>:	mp    QWORD PTR [rsp+0x30],0x0)
0040| 0x7fff2eb21c90 --> 0x0
0048| 0x7fff2eb21c98 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
0056| 0x7fff2eb21ca0 --> 0x0
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value

Breakpoint 1, core::str::validations::run_utf8_validation () at library/core/src/str/validations.rs:121
121	library/core/src/str/validations.rs: No such file or directory.
```


## Password and flag
After typing a random password we continue the program (`c` = `continue`), and take a notice of the `RSI` register, containing the password `the_secret_password_is_secret_and_hidden`.
```
gdb-peda$ c
Continuing.
[----------------------------------registers-----------------------------------]
RAX: 0x7fff2eb21d70 --> 0x7f404b1f3608 --> 0x7f404b1e2090 ("Enter password: called `Result::unwrap()` on an `Err` value")
RBX: 0x555556054160 --> 0x575462630f002254
RCX: 0x6e ('n')
RDX: 0x28 ('(')
RSI: 0x555556056760 ("the_secret_password_is_secret_and_hidden")
RDI: 0x0
RBP: 0x28 ('(')
RSP: 0x7fff2eb21d28 --> 0x555556054160 --> 0x575462630f002254
RIP: 0x7f404b1df54b (<_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx)
R8 : 0x555556056750 --> 0x21 ('!')
R9 : 0x1860
R10: 0x2a ('*')
R11: 0x246
R12: 0x555556056760 ("the_secret_password_is_secret_and_hidden")
R13: 0x28 ('(')
R14: 0x555556054120 --> 0x2537071050654a20
R15: 0x5555560541c0 --> 0x23271711746a5631
EFLAGS: 0x246 (carry PARITY adjust ZERO sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f404b1df545 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+5>:	push   rbx
   0x7f404b1df546 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+6>:	mov    rax,rdi
   0x7f404b1df549 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+9>:	xor    edi,edi
=> 0x7f404b1df54b <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx
   0x7f404b1df54e <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+14>:	sub    rcx,0xf
   0x7f404b1df552 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+18>:	cmovae rdi,rcx
   0x7f404b1df556 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+22>:	test   rdx,rdx
   0x7f404b1df559 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+25>:	je     0x7f404b1df759 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+537>
[------------------------------------stack-------------------------------------]
0000| 0x7fff2eb21d28 --> 0x555556054160 --> 0x575462630f002254
0008| 0x7fff2eb21d30 --> 0x555556054120 --> 0x2537071050654a20
0016| 0x7fff2eb21d38 --> 0x5555560541c0 --> 0x23271711746a5631
0024| 0x7fff2eb21d40 --> 0x28 ('(')
0032| 0x7fff2eb21d48 --> 0x7f404b19d741 (<_ZN6medium4main17h529ab5f9f5af22f3E+1089>:	cmp    DWORD PTR [rsp+0x20],0x1)
0040| 0x7fff2eb21d50 --> 0x7f404b1f2040 --> 0x1
0048| 0x7fff2eb21d58 --> 0x555556056760 ("the_secret_password_is_secret_and_hidden")
0056| 0x7fff2eb21d60 --> 0x28 ('(')
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value

Breakpoint 1, core::str::validations::run_utf8_validation () at library/core/src/str/validations.rs:121
121	in library/core/src/str/validations.rs
```

```
$ ./rust_medium
Enter password: the_secret_password_is_secret_and_hidden
Flag: etj{rust_sure_creates_long_and_weird_function_names}
```

```
login@corax:~$ scoreboard etj{rust_sure_creates_long_and_weird_function_names}
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.4_rusty_reversing_medium
Svar:     rust_sure_creates_long_and_weird_function_names

Gratulerer, korrekt svar!
```
