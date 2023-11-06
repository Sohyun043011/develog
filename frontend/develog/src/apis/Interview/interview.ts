import { privateApi } from "apis";

export const getInterviewMainUnchanged = async (id: number) => {
  try {
    const response = await privateApi.get(`/interview`, {
        params:{
            "historyId": id,
          }
    }
    );
    
    console.log(response.data);
    return response.data;
  } catch (error) {
    throw error;
  }
};
