
def calculateSum(num):
  if num:
    sum=  num + calculateSum(num-1)
    return sum
  else:
    return 0
res = calculateSum(5)

print(res)