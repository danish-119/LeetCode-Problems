var sortColors = function (nums) {
  let zero = 0,
    one = 0,
    two = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === 0) {
      zero++;
    } else if (nums[i] === 1) {
      one++;
    } else if (nums[i] === 2) {
      two++;
    }
  }

  for (let i = 0; i < zero; i++) {
    nums[i] = 0;
  }
  for (let i = zero; i < zero + one; i++) {
    nums[i] = 1;
  }
  for (let i = zero + one; i < zero + one + two; i++) {
    nums[i] = 2;
  }

  return nums;
};

console.log(sortColors([2, 0, 2, 1, 1, 0]));
