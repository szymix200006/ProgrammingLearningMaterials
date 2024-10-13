import sys

class Node():
    def __init__(self, state, parent, action):
        self.state = state
        self.parent = parent
        self.action = action
        
        
class StackFrontier():
    def __init__(self):
        self.frontier = []
    
    def add(self, node):
        self.frontier.append(node)
        
    def containts_state(self, state):
        return any(node.state == state for node in self.frontier)
    
    def empty(self):
        return len(self.frontier) == 0
    
    def remove(self):
        if self.emtpty():
            raise Exception("Empty frontier")
        else:
            node = self.frontier[-1]
            self.frontier = self.frontier[:-1]
            return node
        
class QueueFrontier(StackFrontier):
    def remove(self):
        if self.empty():
            raise Exception("Empty frontier")
        else:
            node = self.frontier[0]
            self.frontier = self.frontier[1:]
            return node
        
class Maze():
    #def __init__(self, filename):
    def solve(self):
        self.num_explored = 0
        
        start = Node(state = self.start, parent = None, action = None)
        frontier = StackFrontier()
        frontier.add(start)
        
        self.explored = set()
        
        while True:
            if frontier.empty():
                raise Exception("No solution")
            
            node = frontier.remove()
            self.num_explored += 1
            
            if node.state == self.goal:
                actions = []
                cells = [] 
                
                while node.parent is not None:
                    actions.append(node.action)
                    cells.append(node.state)
                    node = node.parent
                actions.reverse()
                cells.reverse()
                self.solution = (actions, cells)
                return
            
            self.explored.add(node.state)
            
            for action, state in self.neighbors(node.state):
                if not frontier.contains_state(state) and state not in self.explored:
                    child = Node(state = state, parent = node, action = action)
                    frontier.add(child)
            
            
            