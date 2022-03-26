import React, {useEffect} from 'react'
import {Table, Button} from 'react-bootstrap'

const TaskTable = () =>{
    return(
        <Table responsive>
            <thead>
                <tr>
                    <th>Tasks</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Dummy Task</td>
                    <td> <Button>Delete</Button></td>
                </tr>
            </tbody>
        </Table>
    )
}

export default TaskTable
