import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import './index.css'

class ItemDisplay extends React.Component {
    constructor() {
        return (
            <div className="App">
                <h1>Hello Poke-Wold</h1>
            </div>
        );
    }
}


ReactDOM.render(<ItemDisplay />, document.getElementById('root'));