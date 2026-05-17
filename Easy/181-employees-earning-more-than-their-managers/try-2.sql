/*
 * Problem #181: Employees Earning More Than Their Managers
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: mysql
 * Date: 12/4/2025, 10:26:16 AM
 * Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
 */

# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee m on e.managerId = m.id where e.salary>m.salary;
