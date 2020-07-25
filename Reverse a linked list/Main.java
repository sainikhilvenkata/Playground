def lit():
  x=c[::-1]
  for i in x:
    print(i)
a=int(input())
c=[]
while a>0:
  c.append(a)
  a=int(input())
print("Before Reversing the list:")
for s in c:
  print(s)
print("After Reversing the list:")
lit()