a=int(input())
c=[]
while a>0:
  c.append(a)
  a=int(input())
if len(c)<2:
  print("There is no second last element in the list")
else:
  print(c[-2],"is the second last element in the list")