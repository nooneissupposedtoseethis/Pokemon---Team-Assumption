import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import './index.css'


const URL ='http://localhost:8080//pokedex//pokemon/3';

class Pokemon extends React.Component{
    constructor(props){
        super(props);
        this.state = { 
            pokeData: [],
            types: [],
            attack1: [],
            attack2:[],
            error: null,
            isLoading: true
        }
    }

    componentDidMount(){
       fetch(URL)
       .then(response => response.json())
       .then(data =>(
            this.setState({
                pokeData: data,
                types:data.types[0],
                attack1: data.attacks[0],
                attack2: data.attacks[1],
                isLoading: false,
            }))
        )
        .catch(error => this.setState({error, isLoading: false}));
    }

    render(){
      return(
        <div key={this.state.pokeData.pokemonId}>
            <h1>{this.state.pokeData.pokemonName}</h1>
            <img src={this.state.pokeData.pokemonPicture} width="100" alt="here lies your pokemon" />
            <p>Type: {this.state.types.typeName}</p>
            <p>Attacks: {this.state.attack1.attackName}, {this.state.attack2.attackName}</p>
        </div>
      );
    }
}


ReactDOM.render(<Pokemon />, document.getElementById('pokemonName'));