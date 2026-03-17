#Destination City
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        result = paths[0][0]
        map = dict()
        for arr in paths:
            map[arr[0]] = arr[1]
        while result in map:
            result = map[result]
        return result
