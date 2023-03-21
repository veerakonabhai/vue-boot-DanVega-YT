<template>
  <!-- removing below 2 lines and lines in <script> to just show the response we get from backend project -->
  <!-- <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  <h1>{{ title }}</h1>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

// import { response } from 'express';

export default {
  name: 'App',
  /* components: {
    HelloWorld
  } */
  data(){ //new data property function to display message(return object) in above <h1>
    return {
      title: ''
    }
  },
  mounted(){  //reachout to backend project and get the text we gave over there
    fetch('http://localhost:8085/veera') //url from where we want data
    .then(response => {
      return response.text(); //since we are just sending string in backend, we are using text() here or else we can have JSON object methods
    })
    .then(data =>{
      this.title = data; //setting teh title with data we received
    });
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
