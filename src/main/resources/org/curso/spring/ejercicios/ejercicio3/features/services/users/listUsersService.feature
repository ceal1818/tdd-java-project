@tag
Feature: List all users

@tag1
Scenario: List all users successfully
Given I has a list all users service
When This services retrieves all users
Then I check then with this list
	|	id	|	nickname	|firstName	| lastName	|	email								|	age	|	photo	|
	|	1		|	ceal			| Carlos		|	Ayala			|	ceal1818@gmail.com	|	32	|	test	|
	|	2		|	ceal1			| Carlos		|	Ayala			|	ceal1919@gmail.com	|	32	|	test	|
	|	3		|	ceal2			| Carlos		|	Ayala			|	ceal2020@gmail.com	|	32	|	test	|
	|	4		|	ceal3			| Carlos		|	Ayala			|	ceal2121@gmail.com	|	32	|	test	|	
