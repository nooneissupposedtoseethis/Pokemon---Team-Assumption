import React, {Component} from 'react';
import ReactDOM from 'react-dom';
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
                        const { pokemonName,pokemonPicture} = pokeData;
                        return(
                            <div key={pokemonName}>
                                <h1>{pokemonName}</h1>
                                <img src={pokemonPicture} width="100" alt="here lies your pokemon" />
                                <p>Type: {pokeData.types[0].typeName}</p>
                                <p>Attacks: {pokeData.attacks[0].attackName}, {pokeData.attacks[1].attackName}</p>
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
    fetch(URL)
    .then(response => response.json())
    .then(data => 
         this.setState({
             pokeData: data,
             isLoading: false,
         })
     )
     .catch(error => this.setState({error, isLoading: false}));
   }

}

ReactDOM.render(<Pokemon />, document.getElementById('pokemonName'));