const prompt = require("prompt-sync")();

      console.log("How many Student do you have?");
      
        let number = prompt("How many subject do they offer? ");
      

   //     let [ ][ ] scores = new let[Students][Subjects];
      
        console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        console.log("Saved successfully!");
        
        
        for (let index = 1; index <= Students; index++) {
            for(let count = 1; count <= Subjects; count++) {
                
                console.log("Entering score for student " + index +" ");
                console.log("Enter score for subject " + count + " ");
      
                scores[index - 1][count - 1] = SUB1;
    
                console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                console.log("Saved successfully!");
            }
        }
  
        console.log("\n==================================================");
        console.log("                          SUBJECT SUMMARY                                         "); 
        console.log("===================================================");

