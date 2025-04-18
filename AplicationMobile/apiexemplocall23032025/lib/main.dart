import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Consumo de API',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  List<dynamic> products = [];

  @override
  void initState() {
    super.initState();
    fetchPosts();
  }

  Future<void> fetchPosts() async {
    final response =
        await http.get(
          Uri.parse('localhost:8081/projeto/api/v1/tech'),
          headers: {'Content-Type': 'application/json; charset=utf8'}
          );

    if (response.statusCode == 200) {
      setState(() {

        String data = utf8.decode(response.bodyBytes);
        products = json.decode(data);
      
      });
    } else {
      throw Exception('Failed to load posts');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Produtos'),
      ),
      body: ListView.separated(
        itemCount: products.length,
        separatorBuilder: (BuildContext context, int index) => Divider(),
        itemBuilder: (BuildContext context, int index) {
          return ListTile(
            title: Text(products[index]['description'])
          );
        },
      ),
    );
  }
}