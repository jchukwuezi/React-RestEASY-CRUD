import {Container, Form, Button} from 'react-bootstrap' 

function App() {
  return (
    <Container className>
      <Form>
        <Form.Group>
            <Form.Label>Add new task</Form.Label>
            <Form.Control placeholder='Examples: wash the dishes, do the laundry' />
            <Button className='mt-4'>Add Task</Button>
        </Form.Group>
      </Form>
    </Container>
  );
}

export default App;
