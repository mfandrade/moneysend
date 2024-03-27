import app from './src/app.js'
const port = process.env.PORT || 3000

app.listen(port, () => {
    console.log(`Application now running on http://localhost:${port}`)
})
