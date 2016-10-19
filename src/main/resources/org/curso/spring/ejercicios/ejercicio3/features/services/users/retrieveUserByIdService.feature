#Author: ceal1818@gmail.com
@tag
Feature: Retrieve a user through retrieving service of user by userId.

@tag1
Scenario: Get a user by ID
Given I have an instance of retrieving service of user by userId 
When It get a user by 1
Then I check it with this object
	|	id	|	nickname	|firstName	| lastName	|	email								|	age	|	photo	|
	|	1		|	ceal			| Carlos		|	Ayala			|	ceal1818@gmail.com	|	32	|	test	|
