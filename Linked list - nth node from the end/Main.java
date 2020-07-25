a=int(input())
c=[]
while a>-1:
  c.append(a)
  a=int(input())
print("Enter the nth node:")
a=int(input())
if a<=len(c):
  a=c[-a]
  print(a,"is the nth node element in the list")
else:
  print("There is no nth node in the list")