import express, { Request, Response, Express } from 'express'
import { statusCodes } from './utils/status-code';



const app: Express = express() ;

app.routes()

app.get('/', (req: Request, res: Response):void => {
    if (req.statusCode !== statusCodes.CREATED) {
        res.send('xulambs')
    }
    res.send('Hello World!')
})

export default app
