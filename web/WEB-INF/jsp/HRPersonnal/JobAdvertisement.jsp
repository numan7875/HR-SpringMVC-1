<!doctype html>
<!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12 col-sm-12">
                        <h1 class="page-header">
                            Job Advertisement 
                        </h1>
                    </div>
                </div>
                <div class="row">
                	<div class="col-lg-12 col-sm-12">
                		<form id="jobAdForm">
							<div class="form-group">
								<label for="jobTitle">Posting Title</label>
								<input type="text" class="form-control" id="jobTitle" placeholder="Enter Posting Title" required>
							</div>
							<div class="form-group">
								<label for="experience">Experience Required</label>
								<input type="text" class="form-control" id="experience" placeholder="Experience" required>
							</div>
							<div class="form-group">
								<label for="description">Job Description</label>
								<textarea class="form-control" rows="5" id="description" placeholder="Enter Job Description" required></textarea>
							</div>
							<div class="form-group">
								<label for="addInfo">Additional Info <small>(Optional))</small></label>
								<input type="file" id="addInfo">
							</div>
							<button type="submit" class="btn btn-success btn-block">Submit</button>
							<div id="adSuccess"></div>
						</form>
                	</div>
                </div>
                <!-- /.row -->
                
               <script src="../js/jobad.js"></script>