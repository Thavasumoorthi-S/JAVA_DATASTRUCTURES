package org.example.contact_details;

class Node
{
    String name;
    long number;
    String email;
    Node nextNode;
    Node(String name,long number,String email)
    {
        this.name=name;
        this.number=number;
        this.email=email;
    }
}