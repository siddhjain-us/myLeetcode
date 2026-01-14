# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# class TreeNodeModified:
#     def __init__(self, val=0, left=None, right=None, l_total=0, r_total=0):
#         self.val = val
#         self.l_total = l_total
#         self.r_total = r_total
#         self.left = left
#         self.right = right


class LeetCode_1339_MaximumProductOfSplittedBinaryTree:

    def maxProduct(self, root: Optional[TreeNode]) -> int:
        # Find totals at each node.
        totals = []
        total = self.compute_totals(root, totals)
        # print(f'Root node [{root.val}] total: [{total}]')
        # print(totals)

        # After finding totals at each node, let's find where to break them
        # We are using hint where node total & total of entire tree is used
        max_product = 0
        node = None     # Only for printing purpose

        for item in totals:
            sub_total = item[0] + item[1] + item[2]
            product = sub_total * (total - sub_total)
            if product > max_product:
                max_product = product
                node = item

        print(f'Max product {max_product} found if we break at Node [{item[1]}]')

        return max_product % (10**9 + 7)
    
    def compute_totals(self, root: Optional[TreeNode], totals):
        l_total = 0
        r_total = 0
        # print(f'Processing node [{root.val}]...')

        if root.left:
            # print(f'Node [{root.val} has left child [{root.left.val}]]')
            l_total = self.compute_totals(root.left, totals)

        if root.right:
            # print(f'Node [{root.val} has right child [{root.right.val}]]')
            r_total = self.compute_totals(root.right, totals)

        # print(f'Node [{root.val}] child totals: [{l_total}, {r_total}]')
        totals.append((l_total, root.val, r_total))
        return (l_total + root.val + r_total)
        



    # def subtreeSum(self, root: Optional[TreeNode]) -> int:
    #     if not root:
    #         return 0
    #     return self.subtreeSum(root.left) + self.subtreeSum(root.right) + root.val

