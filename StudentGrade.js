const prompt = require('prompt-sync')();

let Students = Number(prompt("How many Student do you have? "));
let Subjects = Number(prompt("How many subject do they offer? "));

let scores = [];

for (let count = 0; count < Students; count++) {
    scores[count] = [];
    for (let index = 0; index < Subjects; index++) {
        scores[count][index] = 0;
    }
}

console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
console.log("Saved successfully!");
for (let index = 1; index <= Students; index++) {
    for (let count = 1; count <= Subjects; count++) {
        console.log("Entering score for student " + index + " ");
        console.log("Enter score for subject " + count + " ");
        let SUB1 = Number(prompt());
        scores[index - 1][count - 1] = SUB1;

        console.log("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        console.log("\nSaved successfully!");
    }
}

console.log("\n==================================================");
console.log("                        SUBJECT SUMMARY                                                 "); 
console.log("\n===================================================");

let passingMark = 50;

for (let count = 1; count <= Subjects; count++) {
    let totalScore = 0;
    let highestScore = scores[0][count - 1];
    let highestStudent = 1;
    let lowestScore = scores[0][count - 1];
    let lowestStudent = 1;
    let passes = 0;
    let fails = 0;

    for (let index = 1; index <= Students; index++) {
        let currentScore = scores[index - 1][count - 1];
        totalScore += currentScore;

        if (currentScore > highestScore) {
            highestScore = currentScore;
            highestStudent = index;
        }

        if (currentScore < lowestScore) {
            lowestScore = currentScore;
            lowestStudent = index;
        }

        if (currentScore >= passingMark) {
            passes++;
        } else {
            fails++;
        }
    }

    let averageScore = totalScore / Students;

    console.log("Subject " + count);
    console.log("Highest scoring student is: Student " + highestStudent + " scoring " + highestScore);
    console.log("Lowest Scoring student is: student " + lowestStudent + " scoring " + lowestScore);
    console.log("Total Score is: " + totalScore);
    console.log("Average score is: " + averageScore.toFixed(2));
    console.log("Number of passes: " + passes);
    console.log("Number of Fails: " + fails);
    console.log("==================================================");
}
