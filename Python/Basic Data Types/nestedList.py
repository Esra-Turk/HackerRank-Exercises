records = []
smallests = []
numberOfDifference = 0
    
for _ in range(int(input())):
    list1 = []
    name = input()
    score = float(input())
    list1.append(name); list1.append(score)
    records.append(list1)

records.sort(key=lambda x: x[1])


for i in range(len(records)):
    smallest = records[0][1]
    if records[i][1] > smallest:
        if(records[i - 1][1] != records[i][1]):
            numberOfDifference += 1
        if(numberOfDifference > 1):
            break
        smallest2 = records[i][0]
        smallests.append(smallest2) 
                
smallests.sort(key=lambda x: x[0])
            
for element in smallests:
    print(element)
