const {createPool} = require('mysql')

const pool = createPool({
    host: 'localhost',
    user: 'root',
    password: '367484',
    connectionLimit: 50
})

module.exports = pool
