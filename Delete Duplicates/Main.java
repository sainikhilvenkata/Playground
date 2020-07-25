def li():
  for x in c:
    print(x)
c=[]
a=int(input())
while a>0:
  c.append(a)
  a=int(input())
print("Linked list before removal of duplicates")
li()
print("Linked list after removal of duplicates")
for x in c:
  while c.count(x)>1:
    c.remove(x)
c.sort()
li()
  