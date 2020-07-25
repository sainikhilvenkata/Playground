a=int(input())
c=[]
while a>-1:
  c.append(a)
  a=int(input())
a=int(input())
print("Enter the value to be searched:")
if a in c:
  print(a,"is present in the list")
else:
  print(a,"is not present in the list")
  