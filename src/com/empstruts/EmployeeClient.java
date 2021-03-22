//package com.empstruts;
//
//public class EmployeeClient {
//    public static void main(String[] args) {
//        EmployeeService empService = new EmployeeService();
//        EmployeeDAO userDao = new EmployeeDAO();
//        empService.setUserDao(userDao);
// 
//        // Add new user - Create of CRUD
//        Employee user1 = new Employee();
//        //user1.setFullName("John1");
//       // user1.setAge(52);
//        
////        Employee user2 = new Employee();
////        user2.setFullName("John2");
////        user2.setAge(52);
//       
//        //empService.addUser(user1);
////        empService.addUser(user2);
// 
//        // Get all users - Read of CRUD
////        for (Employee retrivedUser : empService.getAllUsers()) {
////            System.out.println(retrivedUser.getFullName());
////            System.out.println(retrivedUser.getAge());
////        }
//       
//        // Get user by id - Read of CRUD
//        Employee retrivedUser = empService.getUserById(1);
//        System.out.println(retrivedUser.getFullName() + "fetched");
//        System.out.println(retrivedUser.getAge());
// 
//        // Update user - Update of CRUD
//        user1.setFullName("KingQ");
//        user1.setAge(25);
//        user1.setId(1);
//        empService.updateUser(user1);
// 
//        retrivedUser = empService.getUserById(1);
//        System.out.println(retrivedUser.getFullName() + "fetched");
//        System.out.println(retrivedUser.getAge());
//        
//        // Delete user - Delete of CRUD
//        //empService.deleteUser(1);
//        
////        retrivedUser = empService.getUserById(1);
////        System.out.println(retrivedUser.getFullName() + "fetched");
////        System.out.println(retrivedUser.getAge());
// 
//    }
//}