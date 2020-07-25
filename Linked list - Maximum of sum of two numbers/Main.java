a=int(input())
c=[]
while a>0:
  c.append(a)
  a=int(input())
c.sort()
a=c[-1]+c[-2]
print(a)
  