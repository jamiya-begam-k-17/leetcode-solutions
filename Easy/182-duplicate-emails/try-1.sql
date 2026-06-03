/*
 * Problem #182: Duplicate Emails
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 5/26/2026, 12:52:51 PM
 * Link: https://leetcode.com/problems/duplicate-emails/
 */

# Write your MySQL query statement below
select Email from Person group by email having count(email)>1;
