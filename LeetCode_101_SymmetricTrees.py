# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

from typing import Optional, List
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        # print(self.inOrder(root.left))
        # print(self.outOrder(root.right))
        return self.inOrder(root.left) == self.outOrder(root.right)
    
    def inOrder(self, root: Optional[TreeNode]) -> List[int]:
        lst = []
        self.inOrderHelper(root, lst)
        return lst

    def inOrderHelper(self, root: Optional[TreeNode], lst):
        if not root:
            lst.append(-1)
        else:
            lst.append(root.val)
            self.inOrderHelper(root.left, lst)
            self.inOrderHelper(root.right, lst)
    
    def outOrder(self, root : Optional[TreeNode]) -> List[int]:
        lst = []
        self.outOrderHelper(root, lst)
        return lst

    def outOrderHelper(self, root: Optional[TreeOrder], lst):
        if not root:
            lst.append(-1)
        else:
            lst.append(root.val)
            self.outOrderHelper(root.right, lst)
            self.outOrderHelper(root.left, lst)