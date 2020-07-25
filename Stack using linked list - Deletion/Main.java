a=int(input())
c=[]
while(a>-1):
  c.append(a)
  a=int(input())
print("Before deleting:")
x=c[::-1]
for i in x:
  print(i,end=' ')
print()
while c!=[]:
  print("Deleted element is",c.pop())
if c==[]:
  print("Stack is empty")
  