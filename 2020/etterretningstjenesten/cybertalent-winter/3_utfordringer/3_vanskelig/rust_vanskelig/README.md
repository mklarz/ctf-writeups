# 3.3.2_rusty_reversing_hard
We are yet again provided with a binary, but this time without `debug_info`.
```sh
$ file rust_hard
rust_hard: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=54fec6fc3b4190b65ea4c4cb6ae7f91bf7c48cb2, stripped
```

Opening the binary in Ghidra also doesn't help, we continue with `gdb` and use `CTRL + C` when prompted for a password, and the continue with stepping until we find something interesting.

```sh
$ gdb -q rust_hard
gdb-peda$ r
Starting program: ./rust_hard
Enter password: ^C
```

By watching the registers and stack whilst stepping over functions, we see the the `RBX` register changing with various characters, and the we start seeing something appear in the stack: `sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe`. 

```
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x0
RBX: 0x72 ('r')
RCX: 0xc ('\x0c')
RDX: 0x555556f7b166 --> 0x7ad74c1d39e314bc
RSI: 0x555556f7b1c6 --> 0x14b820424b8664c9
RDI: 0x0
RBP: 0x555556f7b180 --> 0xe706955ab9544192
RSP: 0x7fffb4a551b0 --> 0x9 ('\t')
RIP: 0x7f97796745f9 (mov    BYTE PTR [rax+rdi*1],bl)
R8 : 0x2
R9 : 0x1701
R10: 0x29 (')')
R11: 0x346
R12: 0x7fffb4a552b8 --> 0x0
R13: 0x0
R14: 0x4f ('O')
R15: 0x555556f7b120 --> 0x826bfc2edc392ee1
EFLAGS: 0x206 (carry PARITY adjust zero sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f97796745ec:	nop    DWORD PTR [rax+0x0]
   0x7f97796745f0:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x3]
   0x7f97796745f5:	xor    bl,BYTE PTR [rsi+rdi*1-0x3]
=> 0x7f97796745f9:	mov    BYTE PTR [rax+rdi*1],bl
   0x7f97796745fc:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x2]
   0x7f9779674601:	xor    bl,BYTE PTR [rsi+rdi*1-0x2]
   0x7f9779674605:	mov    BYTE PTR [rax+rdi*1+0x1],bl
   0x7f9779674609:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x1]
[------------------------------------stack-------------------------------------]
0000| 0x7fffb4a551b0 --> 0x9 ('\t')
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe")
0024| 0x7fffb4a551c8 --> 0x4f ('O')
0032| 0x7fffb4a551d0 --> 0x0
0040| 0x7fffb4a551d8 --> 0x8
0048| 0x7fffb4a551e0 --> 0x7fffb4a55280 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0056| 0x7fffb4a551e8 --> 0x1
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value
0x00007f97796745f9 in ?? ()
```

```sh
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x72 ('r')
RBX: 0x72 ('r')
--- snip ---
[------------------------------------stack-------------------------------------]
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super")
--- snip ---
```

And finially giving us:

```sh
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long")

```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ ./rust_hard
Enter password: sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long
Flag: etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ scoreboard etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.2_rusty_reversing_hard
Svar:     i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement

Gratulerer, korrekt svar!
```
