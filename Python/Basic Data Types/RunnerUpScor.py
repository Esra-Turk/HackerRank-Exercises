n = int(input())
arr = map(int, input().split())

list = set(arr) 
    
the_biggest = max(list)
list.remove(the_biggest)
    
now_the_biggest = max(list)
print(now_the_biggest)