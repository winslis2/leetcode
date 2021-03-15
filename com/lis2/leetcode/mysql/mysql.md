-  [连接两个表](https://leetcode-cn.com/problems/combine-two-tables/)
```
select FirstName,LastName,City,State from Person left join Address on Person.PersonId = Address.PersonId;

select FirstName,LastName,City,State from Person left join Address USING(PersonId);
```
[找到工资第二高的人](https://leetcode-cn.com/problems/second-highest-salary/)
```
select 
    (select distinct Salary from Employee order by Salary desc limit 1 offset 1)
as SecondHighestSalary;
```