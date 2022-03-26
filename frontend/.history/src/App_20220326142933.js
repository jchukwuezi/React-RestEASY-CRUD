import { useState } from 'react';
import {Container, Form, Button, Row} from 'react-bootstrap' 
import TaskTable from './TaskTable';

function App() {
  const [taskBody, setTaskBody] = useState("")
  
  const createTask =(e) =>{
    e.preventDefault()
    fetch("",{
      method: 'POST',
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify({
        Task: {
            taskBody: taskBody
        }
    }),

    })
  }


  return (
    <Container className='justify-content-center'>
      <Form className='mt-3' onSubmit={createTask}>
        <Form.Group>
            <Form.Label>Add new task</Form.Label>
            <Form.Control placeholder='Examples: wash the dishes, do the laundry' onChange={e => setTaskBody(e.target.value)} />
            <div className='d-grid'>
              <Button className='mt-4'>Add Task</Button>
            </div>
        </Form.Group>
      </Form>

      <Row  className='mt-5'>
        <TaskTable />
      </Row>
    </Container>
  );
}

export default App;
