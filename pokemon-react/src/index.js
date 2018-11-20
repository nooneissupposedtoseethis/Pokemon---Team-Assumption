import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';
import './index.css'


const URL ='http://localhost:8080//pokedex/list';

class Pokemon extends React.Component {
   state = {
       isLoading: true,
       pokeData: [],
       error: null
   }

   render(){
       const { isLoading, pokeData, error} = this.state;
       return ( 
            <React.Fragment>
                {error ? <p>{error.message}</p> : null}

                {!isLoading ? (
                    
                    pokeData.map(pokeData => {
                        const { pokemonName,pokemonPicture, pokemonType, attackName1, attackName2} = pokeData;
                        return(
                            <div key={pokemonName}>
                                <h1>{pokemonName}</h1>
                                <img src={pokemonPicture} width="100" alt="here lies your pokemon" />
                                <p>Type: {pokemonType}</p>
                                <p>Attacks: {attackName1}, {attackName2}</p>
                            </div>
                        );
                    })
                ) : (
                    <h3>Loading...</h3>
                )}
            </React.Fragment>
       );
   }

   componentDidMount(){
       this.getData();
   }

  /*fetchData(){
       fetch(URL)
       .then(response => response.json())
       .then(data => 
            this.setState({
                pokeData: data,
                isLoading: false,
            })
        )
        .catch(error => this.setState({error, isLoading: false}));
  } */

   getData(){
       axios.get(URL)
       .then(response => 
            response.data.map(pokeData => ({
                pokemonName: `${pokeData.pokemonName}`,
                pokemonPicture: `${pokeData.pokemonPicture}`,
                pokemonType: `${pokeData.types[0].typeName}`,
                attackName1: `${pokeData.attacks[0].attackName}`,
                attackName2: `${pokeData.attacks[1].attackName}`

            }))
        )
        .then(pokeData => {
            this.setState({
                pokeData,
                isLoading: false
            });
        })
       .catch(error => this.setState({error, isLoading: false}));
   }
}

ReactDOM.render(<Pokemon />, document.getElementById('pokemonName'));