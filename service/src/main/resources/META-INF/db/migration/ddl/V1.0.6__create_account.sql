create table account(
    id int primary key,  
    oicdUserName varchar(255) unique not null,
    name varchar(128),
    tierTableId int,
    evaluateByMinderRanking boolean 
);
CREATE SEQUENCE accountid_seq START 1;
