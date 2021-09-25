# https://leetcode.com/problems/two-sum/


#recursive - O(n^2)

def iterative_two_sum(nums, target, index_tracker):
    for i in range(1, len(nums)):
        if (nums[0] + nums[i] == target):
            return [index_tracker, index_tracker + i]

    return iterative_two_sum(nums[1:], target, index_tracker+1)

#average time O(n) as the averege time complex for dict get is O(1)

def faster_two_sum(nums, target):
    nums_dict = {}
    index_counter = 0
    for i in nums:
        nums_dict[i] = index_counter
        index_counter +=1


    for j in range(len(nums)):
        y = target - nums[j]
        if nums_dict.get(y) != None and nums_dict.get(y) != j:
            return [j, nums_dict.get(y)]

#ex 1
nums = [2,7,11,15]
target = 9
start_index = 0
print(iterative_two_sum(nums,target,start_index))
print(faster_two_sum(nums, target))

#ex 2
nums = [3,2,4]
target = 6

start_index = 0
print(iterative_two_sum(nums,target,start_index))
print(faster_two_sum(nums, target))

#ex 3
nums = [3,3]
target = 6

start_index = 0
print(iterative_two_sum(nums,target,start_index))
print(faster_two_sum(nums, target))