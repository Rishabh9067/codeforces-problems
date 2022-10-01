class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        vector<int> indices;
        if(nums.size() == 2 && (nums[0] + nums[1]) == target ) {
            indices.push_back(0);
            indices.push_back(1);
            
            return indices;
        }
        
        unordered_map<int, int> diffs;
        for(int i = 0; i < nums.size(); ++i) {
            diffs.insert({target-nums[i], i});
        }
        
        for(int i = 0; i < nums.size(); ++i) {
            auto it = diffs.find(nums[i]);
            
            if( it != diffs.end() && i != it->second) {
                indices.push_back(i);
                indices.push_back(it->second);
                break;
            }
        }
        
        return indices;
    }
};
