#Problem: https://www.hackerrank.com/challenges/python-loops/problem

n = int(input())
    
i = 0
while i < 21:
    print(i **2)
    i += 1
    if i == n:
        break
