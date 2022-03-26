import {Container, Form, Button} from 'react-bootstrap' 

function App() {
  return (
    <Container className='justify-content-center'>
      <Form className='mt-3'>
        <Form.Group>
            <Form.Label>Add new task</Form.Label>
            <Form.Control placeholder='Examples: wash the dishes, do the laundry' />
            <div className='d-grid'>
              <Button className='mt-4'>Add Task</Button>
            </div>
        </Form.Group>
      </Form>
    </Container>
  );
}

export default App;
