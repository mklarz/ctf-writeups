import networkx as nx
import matplotlib.pyplot as plt

DEBUG = True

NODES = {
    1: { "label": "n", "edges": [2, 4] },
    2: { "label": " ", "edges": [1, 3, 8] },
    3: { "label": " ", "edges": [2, 40] },
    4: { "label": "r", "edges": [1, 5, 36, 40] },
    5: { "label": "e", "edges": [4, 6, 38] },
    6: { "label": "v", "edges": [5, 7] },
    7: { "label": " ", "edges": [6, 8, 40] },
    8: { "label": " ", "edges": [2, 7, 9, 38] },
    9: { "label": "r", "edges": [8, 10, 35] },
    10: { "label": "o", "edges": [9, 28, 30, 35] },
    11: { "label": " ", "edges": [12, 30] },
    12: { "label": "m", "edges": [11, 13] },
    13: { "label": "o", "edges": [12, 14, 17] },
    14: { "label": " ", "edges": [13, 15, 16, 17, 99] },
    15: { "label": "r", "edges": [14, 16, 19] },
    16: { "label": "g", "edges": [14, 15, 17, 18, 19, 24] },
    17: { "label": "v", "edges": [13, 14, 16, 20, 25] },
    18: { "label": "n", "edges": [16, 22, 99] },
    99: { "label": " ", "edges": [14, 18, 21] },
    19: { "label": "o", "edges": [15, 16, 36] },
    20: { "label": " ", "edges": [17, 21, 23] },
    21: { "label": " ", "edges": [20, 24, 25, 99] },
    22: { "label": "e", "edges": [18, 23] },
    23: { "label": "t", "edges": [20, 22, 24, 25] },
    24: { "label": "e", "edges": [16, 21, 23] },
    25: { "label": "i", "edges": [17, 21, 23] },
    26: { "label": "e", "edges": [27, 32, 35] },
    27: { "label": "e", "edges": [26, 28, 33, 34] },
    28: { "label": "f", "edges": [10, 27, 29] },
    29: { "label": " ", "edges": [28, 30, 31] },
    30: { "label": " ", "edges": [10, 11, 29, 31, 33, 35] },
    31: { "label": " ", "edges": [29, 30, 32] },
    32: { "label": "n", "edges": [26, 31, 33, 34] },
    33: { "label": "v", "edges": [27, 30, 32] },
    34: { "label": "r", "edges": [27, 32, 35] },
    35: { "label": "d", "edges": [9, 10, 26, 30, 34] },
    36: { "label": "n", "edges": [4, 19, 37] },
    37: { "label": " ", "edges": [36, 38] },
    38: { "label": " ", "edges": [5, 8, 37, 39] },
    39: { "label": "v", "edges": [38, 40] },
    40: { "label": "a", "edges": [3, 4, 7, 39] },
}

EDGES = set()

LABELS = {}

# From https://gist.github.com/mikkelam/ab7966e7ab1c441f947b
def hamilton(G):
    F = [(G,[list(G.nodes())[0]])]
    n = G.number_of_nodes()
    while F:
        graph,path = F.pop()
        confs = []
        neighbors = (node for node in graph.neighbors(path[-1]) 
                     if node != path[-1]) #exclude self loops
        for neighbor in neighbors:
            conf_p = path[:]
            conf_p.append(neighbor)
            conf_g = nx.Graph(graph)
            conf_g.remove_node(path[-1])
            confs.append((conf_g,conf_p))
        for g,p in confs:
            if len(p)==n:
                return p
            else:
                F.append((g,p))
    return None

# Loop through nodes and make sure they have valid edges
for node_id, node in NODES.items():
    edges = ""
    LABELS[node_id] = node["label"]
    for edge_node_id in node["edges"]:
        edge_node = NODES[edge_node_id]

        if node_id not in edge_node["edges"]:
            print(f"Node #{node_id} has Node #{edge_node_id} as an edge node, but Node #{edge_node_id} does not have Node #{node_id}")
            print(f"Node #{node_id}:")
            print(node)
            print(f"Node #{edge_node_id}:")
            print(edge_node)
            exit(1)

        edges += f"\t-> {edge_node_id}\n"

        # Let's add the edge to our global set, if it doesn't exist there yet
        # Very inefficient method to check if the edge exists or not
        for global_edge in EDGES:
            if (global_edge[0] == node_id and global_edge[1] == edge_node_id) \
            or (global_edge[1] == node_id and global_edge[0] == edge_node_id):
                break
        else:
            EDGES.add((node_id, edge_node_id))


    print(f"Node #{node_id} [label='{node['label']}'] has {len(node['edges'])} edges")
    if DEBUG:
        print(edges)

print(f"Found a total of {len(EDGES)} edges")

# Let's re-create the graph
G = nx.DiGraph()

for node in NODES:
    G.add_node(node)

for edge in EDGES:
    G.add_edge(edge[0], edge[1])


print("This might take a while....") # 706893343 iterations...
# path = hamilton(G)
path = [1, 4, 5, 6, 7, 8, 9, 10, 28, 29, 31, 32, 34, 35, 26, 27, 33, 30, 11, 12, 13, 14, 99, 18, 22, 23, 25, 17, 20, 21, 24, 16, 15, 19, 36, 37, 38, 39, 40, 3, 2]

# Reverse the path or we get:
# nrev  rof  nrdeev  mo  netiv  egron  va
path = path[::-1]


# Generate the flag
answer = ""
for node_id in path:
    answer += NODES[node_id]["label"]

print("Answer:", answer)

nx.draw(G, labels=LABELS, with_labels=True)
plt.show()
