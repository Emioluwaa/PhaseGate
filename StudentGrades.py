print("How many Student do you have?")
Students = int(input())
print("How many subject do they offer? ")
Subjects = int(input())

scores = []
for index in range(Students):
    row = []
    for count in range(Subjects):
        row.append(0)
    scores.append(row)

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("Saved successfully!")
for index in range(1, Students + 1):
    for count in range(1, Subjects + 1):
        print("Entering score for student " + str(index) + " ")
        print("Enter score for subject " + str(count) + " ")
        SUB1 = int(input())
        scores[index - 1][count - 1] = SUB1

        print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        print("Saved successfully!")

print("\n==================================================")
print("                        SUBJECT SUMMARY                                                 ") 
print("===================================================")

passingMark = 50

for count in range(1, Subjects + 1):
    totalScore = 0
    highestScore = scores[0][count - 1]
    highestStudent = 1
    lowestScore = scores[0][count - 1]
    lowestStudent = 1
    passes = 0
    fails = 0

    for index in range(1, Students + 1):
        currentScore = scores[index - 1][count - 1]
        totalScore += currentScore

        if currentScore > highestScore:
            highestScore = currentScore
            highestStudent = index

        if currentScore < lowestScore:
            lowestScore = currentScore
            lowestStudent = index

        if currentScore >= passingMark:
            passes += 1
        else:
            fails += 1

    averageScore = totalScore / Students

    print("Subject " + str(count))
    print("Highest scoring student is: Student " + str(highestStudent) + " scoring " + str(highestScore))
    print("Lowest Scoring student is: student " + str(lowestStudent) + " scoring " + str(lowestScore))
    print("Total Score is: " + str(totalScore))
    print("Average score is: {:.2f}".format(averageScore))
    print("Number of passes: " + str(passes))
    print("Number of Fails: " + str(fails))
    print("==================================================")
