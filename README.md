# spring-22-project

Explanation of the part that is written by İrem Küçük:

First of all I defined p=3 as a number of facilities will be opened.
After that I defined TNOW which will be calculate the CPU time at the end of the problem.
Then, I create a while loop which will run when p is not equal openedFacilities.size().

Inside of this loop I created for loop which will loop until the facs.length.
And inside of it ı set distance=0 because of to find each distances of rows separetly.What ı want to say is ı refresh distance every time when it skip to next row.
Then, ı hold the distances of rows which is also distance of facility i to total points in an array whose name is recordDistancesOfRows.
Then, ı print the distances of the facilities to total points.

Inside of the while loop a added two more for loop to decide which facilities will be open.
In the first for loop, ı refress the min to true value if it necessary in a if statement and,to be able to find the second or third etc. minimum ı set this value to -100 which is negative and distances cannot be negative so that we will not look for this point again.It is kinda deleting .
In the second for loop I add the recordedIndexes which hold the minimum with helps of last for loop to the openedFacilities arraylist.Now, I have opened the facilities in ascending order according to their total distance from the points.And, I exit from while loop.
Now, I have to decide which point assigned to which facility.
To be able to do that, I set distance=0,min to very big number,and also ı created two more variables holderOfPointIndex and holderOfFacsIndex.
Again, I created a for loop which run until the openedFacilities.size().Inside of it ,I assigned distance to their respective values from distanceMatrix.And, make the necessary cahnges for the min.Then,it finds which points assign which facility.
For the last thing ,I created LastTNOW and find timeSpend.


Conclusion of the problem:

When problem size increased run time will be decreased.
For example ;
When we have 3 candidate facilities and 3 of them will opened, and also we have 20 points CPU:13.0.
When we have 4 candidate facilities and 3 of them will opened, and also we have 20 points CPU:12.0.
When we have 5 candidate facilities and 3 of them will opened, and also we have 20 points CPU:11.0.

When you hold the number of points and number of facilities will be open is stable and the only thing change is increased candidate location number, CPU time of the code will be decreased.

When we have 5 candidate facilities and 3 of them will opened, and also we have 10 points CPU:13.0.
When we have 5 candidate facilities and 3 of them will opened, and also we have 15 points CPU:11.0.
When we have 5 candidate facilities and 3 of them will opened, and also we have 25 points CPU:23.0.

When you hold the number of facilities will be open and number of candidate facility number is stable and the only thing change is increased number of points, CPU time of the code will be increased.

As a result,when we increased the candidate location for facilities CPU time will be decreased but, when we increased the number of points CPU time of the code will be increased.



