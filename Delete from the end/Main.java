def printlist():
  for i in c:
    print(i)
a=int(input())
c=[]
while a>0:
  c.append(a)
  a=int(input())
print("Before deletion:")
printlist()
i=1
while c!=[]:
  print("After",i,"deletion:")
  c.pop()
  printlist()
  i=i+1
if c==[]:
  print("No value to delete")