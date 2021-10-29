package com.bridgelabz;

public class LinkedList {

	    Node head;
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    public void insert(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        if(head==null)
	        {
	            new_node.next = head;
	            head = new_node;
	        }
	        else
	        {
	            System.out.println("First Node Already Created!!");
	        }
	    }
	public void print()
	    {
	        Node head_node = head;
	        if(head==null)
	        {
	            System.out.println("LinkedList is Empty");
	        }
	        else
	        {

	            System.out.print("FirstNode is:"+head_node.data);
	            head_node = head_node.next;
	        }
	    }
	    public static void main(String[] args)
	    {
	        LinkedList llist = new LinkedList();
	        llist.insert(7);
	        llist.insert(8);
	        llist.print();
	    }
	}