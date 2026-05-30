# NeetCode 150 Cheat Sheet

A comprehensive guide to the NeetCode 150 curriculum, organized by roadmap topics with problem difficulties, official LeetCode question numbers, specific algorithmic patterns, and optimal Big-O complexities.

## Table of Contents
1. [Arrays & Hashing](#1-arrays--hashing)
2. [Two Pointers](#2-two-pointers)
3. [Sliding Window](#3-sliding-window)
4. [Stack](#4-stack)
5. [Binary Search](#5-binary-search)
6. [Linked List](#6-linked-list)
7. [Trees](#7-trees)
8. [Tries](#8-tries)
9. [Heap / Priority Queue](#9-heap--priority-queue)
10. [Backtracking](#10-backtracking)
11. [Graphs](#11-graphs)
12. [Advanced Graphs](#12-advanced-graphs)
13. [1-D Dynamic Programming](#13-1-d-dynamic-programming)
14. [2-D Dynamic Programming](#14-2-d-dynamic-programming)
15. [Greedy](#15-greedy)
16. [Intervals](#16-intervals)
17. [Math & Geometry](#17-math--geometry)
18. [Bit Manipulation](#18-bit-manipulation)

---

## 1. Arrays & Hashing

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | 🟢 Easy | Hash Set | $O(N)$ | $O(N)$ |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | 🟢 Easy | Frequency Counter (Hash Map / Fixed Array) | $O(N)$ | $O(1)$ |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 🟢 Easy | Hash Map (Complement Lookup) | $O(N)$ | $O(N)$ |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | 🟡 Medium | Categorization by Sorted String / Frequency Key | $O(N \cdot M \log M)$ | $O(N \cdot M)$ |
| 347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | 🟡 Medium | Bucket Sort / Min-Heap | $O(N)$ | $O(N)$ |
| 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | 🟡 Medium | Prefix & Suffix Products Dynamic Accumulation | $O(N)$ | $O(1)$ |
| 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | 🟡 Medium | Grid Validation via Hash Sets | $O(1)$ | $O(1)$ |
| 271 | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/) | 🟡 Medium | Length-Prefix Delimiting (`Length + '#'`) | $O(N)$ | $O(1)$ |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | 🟡 Medium | Set-Based Sequence Tracking (Left-Boundary Check) | $O(N)$ | $O(N)$ |

---

## 2. Two Pointers

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | 🟢 Easy | Converging Pointers (Left / Right) | $O(N)$ | $O(1)$ |
| 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | 🟡 Medium | Converging Pointers on Sorted Range | $O(N)$ | $O(1)$ |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | 🟡 Medium | Sorting + Anchored Two-Pointer Search | $O(N^2)$ | $O(1)$ |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | 🟡 Medium | Greedy Converging Pointers | $O(N)$ | $O(1)$ |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | 🔴 Hard | Dynamic Max-Scanning / Two Pointers | $O(N)$ | $O(1)$ |

---

## 3. Sliding Window

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | 🟢 Easy | Two Pointers (Dynamic Low Tracking) | $O(N)$ | $O(1)$ |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | 🟡 Medium | Dynamically Expandable Window + Hash Set Tracker | $O(N)$ | $O(N)$ |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | 🟡 Medium | Window Expansion + Frequency Tracking Maxima | $O(N)$ | $O(1)$ |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | 🟡 Medium | Fixed-Size Window Sliding + Frequency Mapping | $O(N)$ | $O(1)$ |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | 🔴 Hard | Variable Window Expansion + Complement Frequency Count | $O(N)$ | $O(1)$ |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | 🔴 Hard | Monotonic Decreasing Deque | $O(N)$ | $O(N)$ |

---

## 4. Stack

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | 🟢 Easy | LIFO Stack Mapping | $O(N)$ | $O(N)$ |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | 🟡 Medium | Coupled Stacks / Tracking State Elements | $O(1)$ | $O(N)$ |
| 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | 🟡 Medium | Operand Stack Reduction | $O(N)$ | $O(N)$ |
| 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | 🟡 Medium | Stack Backtracking with Structural Constraints | $O(\frac{4^N}{\sqrt{N}})$ | $O(N)$ |
| 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | 🟡 Medium | Monotonic Decreasing Stack | $O(N)$ | $O(N)$ |
| 853 | [Car Fleet](https://leetcode.com/problems/car-fleet/) | 🟡 Medium | Sorting by Position + LIFO Stack Time Analysis | $O(N \log N)$ | $O(N)$ |
| 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | 🔴 Hard | Monotonic Increasing Stack | $O(N)$ | $O(N)$ |

---

## 5. Binary Search

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | 🟢 Easy | Standard Divide and Conquer | $O(\log N)$ | $O(1)$ |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | 🟡 Medium | Matrix Index Flattening to Linear Space | $O(\log(M \cdot N))$ | $O(1)$ |
| 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | 🟡 Medium | Binary Search on Answer Space Range | $O(N \log M)$ | $O(1)$ |
| 153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | 🟡 Medium | Rotated Array Minimum Point Targeting | $O(\log N)$ | $O(1)$ |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | 🟡 Medium | Conditional Midpoint Evaluation | $O(\log N)$ | $O(1)$ |
| 981 | [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/) | 🟡 Medium | Hash Map of Arrays + Binary Search Lookup | $O(\log N)$ | $O(N)$ |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | 🔴 Hard | Array Partition Dissection Strategy | $O(\log(\min(M, N)))$ | $O(1)$ |

---

## 6. Linked List

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | 🟢 Easy | Iterative Iteration Pointer Realignment | $O(N)$ | $O(1)$ |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | 🟢 Easy | Structural Dummy Node Pointer Advancement | $O(N + M)$ | $O(1)$ |
| 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | 🟡 Medium | Half Split (Slow/Fast) + Reverse Half + Interleave | $O(N)$ | $O(1)$ |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | 🟡 Medium | Two Pointers with Strict Separation Interspace | $O(N)$ | $O(1)$ |
| 138 | [Copy List With Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | 🟡 Medium | Hash Interlinked Clone / Node Interweaving | $O(N)$ | $O(N)$ |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | 🟡 Medium | Elementary Addition Simulation | $O(\max(N, M))$ | $O(1)$ |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | 🟢 Easy | Floyd's Cycle Finding (Tortoise & Hare) | $O(N)$ | $O(1)$ |
| 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | 🟡 Medium | Graph Cycle Intercept (Floyd's Algorithm) | $O(N)$ | $O(1)$ |
| 146 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | 🟡 Medium | Hash Map Linked to Doubly Linked List (DLL) | $O(1)$ | $O(C)$ |
| 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | 🔴 Hard | Min-Heap / Divide and Conquer Merging | $O(N \log K)$ | $O(K)$ |
| 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | 🔴 Hard | Segment Counting + Explicit Pointer Remapping | $O(N)$ | $O(1)$ |

---

## 7. Trees

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | 🟢 Easy | Postorder Traversal Structure Inversion | $O(N)$ | $O(H)$ |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | 🟢 Easy | DFS Recursive Height Assessment / BFS | $O(N)$ | $O(H)$ |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | 🟢 Easy | Subtree Height Structural Analysis (Bottom-Up) | $O(N)$ | $O(H)$ |
| 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | 🟢 Easy | Bottom-Up Height Validation Check | $O(N)$ | $O(H)$ |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | 🟢 Easy | Simultaneous Double-Tree Preorder Traversal | $O(N)$ | $O(H)$ |
| 572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | 🟢 Easy | Nested Structural Matching Tree Identity DFS | $O(N \cdot M)$ | $O(H_1)$ |
| 235 | [Lowest Common Ancestor of a BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | 🟡 Medium | BST BST Pivot Point Tree Navigation | $O(H)$ | $O(1)$ |
| 102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | 🟡 Medium | BFS Queue Exploration Processing | $O(N)$ | $O(N)$ |
| 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | 🟡 Medium | BFS Layer Edge Capture / Modified DFS | $O(N)$ | $O(N)$ |
| 1448 | [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | 🟡 Medium | Preorder Traversal Tracking Highest Ancestor | $O(N)$ | $O(H)$ |
| 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | 🟡 Medium | Interval Constraint Injection ($-\infty < X < \infty$) | $O(N)$ | $O(H)$ |
| 230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | 🟡 Medium | Inorder DFS Structural Stopping Condition | $O(H + K)$ | $O(H)$ |
| 105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 🟡 Medium | Hash Mapping Inorder + Recursive Split Boundaries | $O(N)$ | $O(N)$ |
| 124 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | 🔴 Hard | Bottom-Up Local Structure Path Assessment | $O(N)$ | $O(H)$ |
| 297 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | 🔴 Hard | String Encoding & Index Preorder Parsing DFS | $O(N)$ | $O(N)$ |

---

## 8. Tries

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 208 | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) | 🟡 Medium | Nested Hash Table Mapping Structural Children Nodes | $O(W)$ | $O(N \cdot W)$ |
| 211 | [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | 🟡 Medium | Trie Structure Expansion + Wildcard Backtracking DFS | $O(W)$ | $O(N \cdot W)$ |
| 212 | [Word Search II](https://leetcode.com/problems/word-search-ii/) | 🔴 Hard | Backtracking Matrix Traversal + Trie Streamlining | $O(M \cdot N \cdot 4^W)$ | $O(W \cdot K)$ |

---

## 9. Heap / Priority Queue

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 703 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | 🟢 Easy | Min-Heap Fixed to Size K | $O(\log K)$ | $O(K)$ |
| 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | 🟢 Easy | Max-Heap Greedy Weight Inversion Reduction | $O(N \log N)$ | $O(N)$ |
| 973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | 🟡 Medium | Max-Heap Eviction / QuickSelect Partitioning | $O(N \log K)$ | $O(K)$ |
| 215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | 🟡 Medium | QuickSelect Algorithm / Min-Heap | $O(N)$ avg | $O(1)$ |
| 621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | 🟡 Medium | Greedy Prioritization Max-Heap / Formulaic Max Idle | $O(N)$ | $O(1)$ |
| 355 | [Design Twitter](https://leetcode.com/problems/design-twitter/) | 🟡 Medium | Linked Data Collections + Heap Merging Lists | $O(K \log F)$ | $O(U + T)$ |
| 295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | 🔴 Hard | Balancing Two Heaps (Max-Heap & Min-Heap Pairs) | $O(\log N)$ | $O(N)$ |

---

## 10. Backtracking

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | 🟡 Medium | Element Choice Splitting Tree (Include/Exclude) | $O(2^N \cdot N)$ | $O(N)$ |
| 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | 🟡 Medium | Element Selection Branching Tree with Target Bounds | $O(2^T \cdot M)$ | $O(T)$ |
| 46 | [Permutations](https://leetcode.com/problems/permutations/) | 🟡 Medium | Elements Positional Swapping / Visited Backtracking | $O(N! \cdot N)$ | $O(N)$ |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | 🟡 Medium | Array Pre-Sorting + Duplicate Skipping Indices | $O(2^N \cdot N)$ | $O(N)$ |
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | 🟡 Medium | Array Sorting + Unique Linear Selection Constraints | $O(2^N \cdot N)$ | $O(N)$ |
| 79 | [Word Search](https://leetcode.com/problems/word-search/) | 🟡 Medium | DFS In-Place Matrix Coordinate Search Matrix | $O(M \cdot N \cdot 4^L)$ | $O(L)$ |
| 131 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | 🟡 Medium | Prefix Validation DFS + Functional Backtracking | $O(2^N \cdot N)$ | $O(N)$ |
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | 🟡 Medium | Character String Construction Backtracking | $O(4^N \cdot N)$ | $O(N)$ |
| 51 | [N-Queens](https://leetcode.com/problems/n-queens/) | 🔴 Hard | Spatial Columns / Diagonal Interference Arrays | $O(N!)$ | $O(N)$ |

---

## 11. Graphs

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | 🟡 Medium | Coordinate Flamping Flood Fill (DFS / BFS) | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 133 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | 🟡 Medium | Node Instance Hash Map Tracking + DFS Graph Cloning | $O(V + E)$ | $O(V)$ |
| 695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | 🟡 Medium | DFS Accumulative Metric Coordinates Tracking | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 417 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) | 🟡 Medium | Ocean Edges Reverse Inward DFS Exploration | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 130 | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) | 🟡 Medium | Perimeter Escape Root Validation (Border DFS) | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 994 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | 🟡 Medium | Multi-Source BFS Layer Propagation | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 286 | [Walls and Gates](https://leetcode.com/problems/walls-and-gates/) | 🟡 Medium | Gate-Driven Multi-Source BFS Layer Distances | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 207 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | 🟡 Medium | Kahn's Topological Sort Algorithm / Visited Loop DFS | $O(V + E)$ | $O(V + E)$ |
| 210 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | 🟡 Medium | Topological Ordering Tracking Arrays | $O(V + E)$ | $O(V + E)$ |
| 684 | [Redundant Connection](https://leetcode.com/problems/redundant-connection/) | 🟡 Medium | Disjoint Set Union (DSU Union-Find) | $O(V \cdot \alpha(V))$ | $O(V)$ |
| 323 | [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | 🟡 Medium | Union-Find Link Reduction / Element Traversal Graph DFS | $O(V + E \cdot \alpha(V))$ | $O(V)$ |
| 261 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) | 🟡 Medium | Loop Tracking Union-Find / Connection Verification DFS | $O(V + E \cdot \alpha(V))$ | $O(V)$ |
| 127 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | 🔴 Hard | Single-Character Transformation Node BFS Pattern | $O(M^2 \cdot N)$ | $O(M^2 \cdot N)$ |

---

## 12. Advanced Graphs

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 332 | [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) | 🟡 Medium | Hierholzer's Algorithm (Eulerian Path Postorder DFS) | $O(E \log (E/V))$ | $O(V + E)$ |
| 1584 | [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) | 🟡 Medium | Prim's Algorithm / Kruskal's Edge DSU | $O(N^2 \log N)$ | $O(N^2)$ |
| 743 | [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | 🟡 Medium | Dijkstra's Single Source Shortest Path Priority Queue | $O(E \log V)$ | $O(V + E)$ |
| 778 | [Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/) | 🟡 Medium | Dijkstra's Algorithm on Grid Heights Tracker | $O(N^2 \log N)$ | $O(N^2)$ |
| 269 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) | 🔴 Hard | Character Constraint Adjacency Mapping Topological DFS | $O(C)$ | $O(1)$ |
| 787 | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | 🔴 Hard | Bellman-Ford Shortest Path Algorithm Relaxation | $O(K \cdot E)$ | $O(V)$ |

---

## 13. 1-D Dynamic Programming

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | 🟢 Easy | Fibonacci Sequential Space Optimization | $O(N)$ | $O(1)$ |
| 746 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | 🟢 Easy | Iterative Local Index Minimum Transitions | $O(N)$ | $O(1)$ |
| 198 | [House Robber](https://leetcode.com/problems/house-robber/) | 🟡 Medium | Alternative Choice Iteration Max State Processing | $O(N)$ | $O(1)$ |
| 213 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | 🟡 Medium | Twin Subarray Range Splitting State Optimization | $O(N)$ | $O(1)$ |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | 🟡 Medium | Expand Around Potential Palindrome Centers | $O(N^2)$ | $O(1)$ |
| 647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | 🟡 Medium | Dual Multi-Center Expansion Tracking Count | $O(N^2)$ | $O(1)$ |
| 91 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | 🟡 Medium | Single/Double Position String Transition Rules | $O(N)$ | $O(N)$ |
| 322 | [Coin Change](https://leetcode.com/problems/coin-change/) | 🟡 Medium | Bottom-Up Linear Array Step DP Iteration | $O(N \cdot A)$ | $O(A)$ |
| 152 | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | 🟡 Medium | Min/Max Coupled Dynamic Extrema Inversion Tracking | $O(N)$ | $O(1)$ |
| 139 | [Word Break](https://leetcode.com/problems/word-break/) | 🟡 Medium | Target Matching Substring Lookback Flags Array | $O(N^2 \cdot M)$ | $O(N)$ |
| 300 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | 🟡 Medium | Coordinate Double Check DP / Patience Binary Sorting | $O(N \log N)$ | $O(N)$ |
| 416 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) | 🟡 Medium | Half-Target Capacity Boolean Row Evaluation Knapsack | $O(N \cdot S)$ | $O(S)$ |

---

## 14. 2-D Dynamic Programming

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | 🟡 Medium | Grid Boundary Cumulative Combination Matrix Rows | $O(M \cdot N)$ | $O(N)$ |
| 1143 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | 🟡 Medium | Multi-String Letter Correlation Evaluation Grid | $O(M \cdot N)$ | $O(N)$ |
| 309 | [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | 🟡 Medium | Finite State Transition Matrix (Buy, Sell, Cooldown) | $O(N)$ | $O(1)$ |
| 518 | [Coin Change II](https://leetcode.com/problems/coin-change-ii/) | 🟡 Medium | Unbounded Combination Accumulation Knapsack Table | $O(C \cdot A)$ | $O(A)$ |
| 494 | [Target Sum](https://leetcode.com/problems/target-sum/) | 🟡 Medium | Subset Conversion Optimization Grid Mapping | $O(N \cdot T)$ | $O(T)$ |
| 97 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | 🟡 Medium | Dual Substring Alignment Combination Matrix Check | $O(M \cdot N)$ | $O(N)$ |
| 72 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | 🟡 Medium | Levenshtein Distance Matrix Transformation Metrics | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 312 | [Burst Balloons](https://leetcode.com/problems/burst-balloons/) | 🔴 Hard | Multi-Range Expansion Partition Splitting DP | $O(N^3)$ | $O(N^2)$ |
| 329 | [Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) | 🔴 Hard | Coordinate Path Multi-Branch DFS Cache Memoization | $O(M \cdot N)$ | $O(M \cdot N)$ |
| 115 | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) | 🔴 Hard | String Character Extraction Combination Count Grid | $O(M \cdot N)$ | $O(N)$ |
| 87 | [Scramble String](https://leetcode.com/problems/scramble-string/) | 🔴 Hard | Range Split Partition Memoized Substring Validation | $O(N^4)$ | $O(N^3)$ |
| 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | 🔴 Hard | Token Sequence Wildcard Recursion Table Matrix | $O(M \cdot N)$ | $O(M \cdot N)$ |

---

## 15. Greedy

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | 🟡 Medium | Kadane's Local Prefix Accumulation Boundary Algorithm | $O(N)$ | $O(1)$ |
| 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | 🟡 Medium | Backward Goal Index Reduction / Max Forward Reach | $O(N)$ | $O(1)$ |
| 45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | 🟡 Medium | Step Incrementation Window Frontier Expansion | $O(N)$ | $O(1)$ |
| 134 | [Gas Station](https://leetcode.com/problems/gas-station/) | 🟡 Medium | Sum Total Check + Local Deficit Starting Adjustment | $O(N)$ | $O(1)$ |
| 846 | [Hand of Straights](https://leetcode.com/problems/hand-of-straights/) | 🟡 Medium | Sequential Frequency Tree Key Minimum Reduction | $O(N \log N)$ | $O(N)$ |
| 1899 | [Merge Triplets to Form Target Triplet](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/) | 🟡 Medium | Metric Multi-Coordinate Boundary Filtering Matcher | $O(N)$ | $O(1)$ |
| 763 | [Partition Labels](https://leetcode.com/problems/partition-labels/) | 🟡 Medium | Element Last Occurrence String Index Boundary Expansion | $O(N)$ | $O(1)$ |
| 678 | [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/) | 🟡 Medium | Star Balance Upper & Lower Bounds Multi-Counter Range | $O(N)$ | $O(1)$ |

---

## 16. Intervals

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | 🟡 Medium | Sequential Array Iteration Partition Grouping | $O(N)$ | $O(N)$ |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | 🟡 Medium | Left Boundary Sort + Linear Extension Checking | $O(N \log N)$ | $O(N)$ |
| 435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | 🟡 Medium | End Boundary Sort + Minimal Removal Eviction Counter | $O(N \log N)$ | $O(1)$ |
| 252 | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | 🟢 Easy | Start Boundary Sort + Sequential Intersection Check | $O(N \log N)$ | $O(1)$ |
| 253 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | 🟡 Medium | Chromosome Timeline Point Event Processing / Min-Heap | $O(N \log N)$ | $O(N)$ |
| 1851 | [Minimum Interval to Include Each Query](https://leetcode.com/problems/minimum-interval-to-include-each-query/) | 🔴 Hard | Sorted Queries + Sweep-Line Min-Heap Tracker | $O(N \log N + M \log M)$ | $O(N + M)$ |

---

## 17. Math & Geometry

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | 🟡 Medium | Matrix Transpose + Column Inversion Reflection | $O(N^2)$ | $O(1)$ |
| 54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | 🟡 Medium | Four-Boundary Tracker Progressive Ring Inward Reduction | $O(M \cdot N)$ | $O(1)$ |
| 73 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | 🟡 Medium | In-Place Primary Row & Column Flag Storing | $O(M \cdot N)$ | $O(1)$ |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | 🟢 Easy | Loop Intercept Set Check / Fast-Slow Tracking Cycle | $O(\log N)$ | $O(\log N)$ |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | 🟢 Easy | Array Reverse Carry Propagation Transition | $O(N)$ | $O(1)$ |
| 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | 🟡 Medium | Exponent Division Logarithmic Binary Multiplication | $O(\log N)$ | $O(\log N)$ |
| 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | 🟡 Medium | Base-10 Arithmetic Coordinate Array Digit Extraction | $O(M \cdot N)$ | $O(M + N)$ |
| 2013 | [Detect Squares](https://leetcode.com/problems/detect-squares/) | 🟡 Medium | Frequency Coordinate Map Diagonal Calculation Verification | $O(1)$ avg | $O(N)$ |

---

## 18. Bit Manipulation

| # | Problem | Difficulty | Core Patterns / Approaches | Time | Space |
|---|---|---|---|---|---|
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | 🟢 Easy | Symmetric Cumulative XOR Reduction | $O(N)$ | $O(1)$ |
| 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | 🟢 Easy | Bit-Shifting Isolation / Brian Kernighan's `N & (N-1)` | $O(1)$ | $O(1)$ |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | 🟢 Easy | Offset Linear Shift Dynamic Programming Bit Formula | $O(N)$ | $O(1)$ |
| 190 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | 🟢 Easy | Systematic Bit Iteration Assembly Tracking Mask | $O(1)$ | $O(1)$ |
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | 🟢 Easy | Linear XOR Cumulative Sum Index Balance | $O(N)$ | $O(1)$ |
| 371 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | 🟡 Medium | Primitive Gate Simulation Loop (XOR Sum & Shifted AND Carry) | $O(1)$ | $O(1)$ |
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | 🟡 Medium | Modular Digit Base-10 Shifting + Bounds Overlap Clamp | $O(\log N)$ | $O(1)$ |