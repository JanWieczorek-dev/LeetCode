# https://leetcode.com/problems/two-sum/


#iterative -

def iterative_two_sum(nums, target, index_tracker):
    for i in range(1, len(nums)):
        if (nums[0] + nums[i] == target):
            return [index_tracker, index_tracker + i]

    return iterative_two_sum(nums[1:], target, index_tracker+1)

#ex 1
nums = [2,7,11,15]
target = 9
start_index = 0
print(iterative_two_sum(nums,target,start_index))

#ex 2
nums = [3,2,4]
target = 6

start_index = 0
print(iterative_two_sum(nums,target,start_index))

#ex 3
nums = [3,3]
target = 6

start_index = 0
print(iterative_two_sum(nums,target,start_index))