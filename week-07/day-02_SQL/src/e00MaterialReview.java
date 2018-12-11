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
