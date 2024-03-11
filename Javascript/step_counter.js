let getFixedCounter = function (k) {
  let value = 0;
  return {
    increment: function () {
      value += k;
    },
    decrement: function () {
      value -= k;
    },
    getValue: function () {
      return value;
    },
  };
}
