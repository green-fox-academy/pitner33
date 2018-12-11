public class e00MaterialReview {
//    What is data?
//
//    What is database?
//
//    What is Structured Query Language?
//
//    What is a relational database?
//
//    What is a table?
//
//    What is a column?
//
//    row - records
//
//    What kind of data types can we store in a column?
//
//    What kind of table relations exists?
//
//    What is a primary key? Why is it important? - to identify the actual record
//
//    What is a foreign key? Why is it important?
//
//    What does CRUD mean?
//    CreateReadUpdateDelete
//
//
//LOGIN: mysql -u root -p
//
//    SHOW DATABASES; - it will show the existing dbs
//
//    use db_example - seleted the db for use
//    show tables - mutatja a tableket a db-ben
//    describe apprentice - ay app table fieldjeit mutatja (ami meg nem letezik)
//
//
//    How can we create a database?
//    CREATE DATABASE `ruppellii-seadog`;     //NO special characters! if you want them use ` `
//    USE ruppellii-seadog;
//    SHOW TABLES
//    CREATE TABLE apprentices (
//       firstname VARCHAR(10),
//       lastname VARCHAR(4) NOT NULL,
//       id INT NOT NULL AUTO_INCREMENT,
//       PRIMARY KEY(id)
//      );
//    DESCRIBE apprentices
//              DROP TABLE apprentices              // DELETE THE TABLE!!!!!!!
//    INSERT INTO apprentices (firstname, lastname) VALUES
//      -> ("John", "Doe"), ("Jane", "Doe");
//    SELECT * FROM apprentices;
//    SELECT firstname FROM Apprentices;
//    INSERT INTO apprentices (lastname, id) VALUES ("Doe", 44);    //nem foglalt id-t meghatarozhatok, de onnan fog tovabbszamolni (45 a kovoetkezo)
//    SELECT firstname, lastname FROM apprentices;
//    SELECT firstname, lastname FROM apprentices WHERE lastname = "Doe";
//    UPDATE apprentices SET firstname = "Bart" WHERE firstname IS NULL;  //a where nelkul minden firstnam valtozik!!!
//
//Find the titles of all movies directed by Steven Spielberg.
    //SELECT title FROM movie WHERE director = "Steven Spielberg";
//
//Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.
    //SELECT DISTINCT year
    //FROM movie
    //INNER JOIN rating
    //    ON movie.mID = rating.mID
    //WHERE stars BETWEEN 4 AND 5
    //ORDER BY year;
//
//
//Find the titles of all movies that have no ratings.
    //SELECT title
    //FROM movie
    //LEFT JOIN rating
    //ON movie.mID = rating.mID
    //WHERE stars IS NULL
//
//
//Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date.
    //SELECT name
    //FROM reviewer
    //LEFT JOIN rating
    //    ON reviewer.rID = rating.rID
    //WHERE ratingDate IS NULL;
//
//
//  SELECT CONCAT(last_name,', ',first_name) AS full_name
//  FROM mytable ORDER BY full_name;
//
//Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate.
// Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars.
    //SELECT reviewer.name, movie.title, rating.stars, rating.ratingDate
    //FROM rating
    //INNER JOIN reviewer ON reviewer.rID = rating.rID
    //INNER JOIN movie ON rating.mID = movie.mID
    //ORDER BY reviewer.name, movie.title, rating.stars;
//
//
//Find the names of all reviewers who rated Gone with the Wind.
    //SELECT DISTINCT reviewer.name
    //FROM rating
    //INNER JOIN movie ON rating.mID = movie.mID
    //INNER JOIN reviewer ON rating.rID = reviewer.rID
    //WHERE movie.title = "Gone with the Wind" AND rating.stars NOT NULL;
//
//
//For any rating where the reviewer is the same as the director of the movie, return the reviewer name, movie title, and number of stars.
    //SELECT DISTINCT reviewer.name, movie.title, rating.stars
    //FROM rating
    //INNER JOIN movie ON rating.mID = movie.mID
    //INNER JOIN reviewer ON rating.rID = reviewer.rID
    //WHERE reviewer.name = movie.director;
//
//
//
//TODO APP EMMEG MITOL SARGA
//  CREATE TABLE todos (
//    -> id INT NOT NULL AUTO_INCREMENT,
//    -> isDone ENUM ('T', 'F') DEFAULT 'F',
//    -> description VARCHAR(255),
//    -> PRIMARY KEY(id)
//    -> );
//
//
//  INSERT INTO todos VALUES
//    -> (NULL, 'T', "Walk the goddamn dog!");
//
//Highschooler ( ID, name, grade )
//English: There is a high school student with unique ID and a given first name in a certain grade.
//
//Friend ( ID1, ID2 )
//English: The student with ID1 is friends with the student with ID2. Friendship is mutual, so if (123, 456)
// is in the Friend table, so is (456, 123).
//
//Likes ( ID1, ID2 )
//English: The student with ID1 likes the student with ID2. Liking someone is not necessarily mutual, so if (123, 456)
// is in the Likes table, there is no guarantee that (456, 123) is also present.
//
//Find the names of all students who are friends with someone named Gabriel.
        //SELECT *
        //FROM Highschooler H1
        //INNER JOIN Friend ON H1.ID = Friend.ID1
        //INNER JOIN Highschooler H2 ON H2.ID = Friend.ID2      //igy lehet megnezni mi a tabla amit letrehoztal a joinolassal
//
//and the solution:
    //SELECT H1.name
    //FROM Highschooler H1
    //INNER JOIN Friend ON H1.ID = Friend.ID1
    //INNER JOIN Highschooler H2 ON H2.ID = Friend.ID2
    //WHERE H2.name = "Gabriel";
//
//
//For every student who likes someone 2 or more grades younger than themselves, return that student's name and grade,
// and the name and grade of the student they like.
    //SELECT H1.name, H1.grade, H2.name, H2.grade
    //FROM Highschooler H1
    //INNER JOIN Likes ON H1.ID = Likes.ID1
    //INNER JOIN Highschooler H2 ON H2.ID = Likes.ID2
    //WHERE (H1.grade - H2.grade) > 1;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    How can we switch between databases?
//
//
//
//    How can we create a table?
//
//
//    How can we check the existing tables?
//
//
//    How can we check the current table's properties?
//
//
//    How can we retrieve all data from a table?
//
//
//    How can we retrieve all data but only specific columns from a table?
//
//
//    How can we retrieve specific data from a table?
//
//
//    What kind of operators do we have?
//
//
//    How can we add data to a table?
//
//
//    How can we modify data in a table?
//
//
//    How can we remove data from a table?
//
//
//    How can you select only the different values?
//
//
//    How can you manipulate the order of the result?
//
//
//    What are the common aggregate functions?
//
//
//    How can we select from multiple tables?
//
//
//
//
//
}
