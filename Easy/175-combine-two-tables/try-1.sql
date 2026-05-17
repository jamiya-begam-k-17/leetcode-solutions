/*
 * Problem #175: Combine Two Tables
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 12/4/2025, 9:55:50 AM
 * Link: https://leetcode.com/problems/combine-two-tables/
 */

# Write your MySQL query statement below
select p.firstName, p.lastName, a.city, a.state from Person p left join Address a on p.PersonId=a.PersonId;
